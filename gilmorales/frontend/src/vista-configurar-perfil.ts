import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

@customElement('vista-configurar-perfil')
export class VistaConfigurarPerfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 30%; height: 50%; background-color: #ffffff; z-index: 999; margin-left: 30%; position: fixed; border-radius: 10px;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="layoutCabeceraVentana" style="justify-content: flex-start; background-color: #AED6F1; align-self: stretch;">
  <vaadin-button theme="icon" aria-label="Add new" id="botonCerrar" style="flex-shrink: 1; font-size: var(--lumo-icon-size-l); flex-grow: 0; height: 100%; align-self: center; background-color: transparent; border: none;">
   <iron-icon icon="lumo:cross" id="ironIcon"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout theme="" id="layoutTitulo" style="flex-shrink: 0; align-self: stretch; align-items: flex-start; background-color: #AED6F1; flex-grow: 0; margin-left: 10%;">
   <h1 id="titulo" style="align-self: center;">Configurar Perfil</h1>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout1" style="align-self: center; flex-grow: 0;">
  <vaadin-vertical-layout id="layoutPrivacidad" style="flex-grow: 0;">
   <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: flex-start; justify-content: flex-start;">
    <h4 id="tituloPrivacidad" style="margin: var(--lumo-space-xs); margin-top: var(--lumo-space-s);">Privacidad</h4>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="layoutVisibilidad" style="margin: var(--lumo-space-s); align-self: stretch;">
    <label id="labelVisibilidad" style="align-self: flex-start;">Visibilidad:</label>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
     <vaadin-radio-group value="foo" id="radioGroupVisibilidad" style="align-self: center;">
      <vaadin-radio-button name="foo" id="radioBotonPrivada" checked>
        Privada 
      </vaadin-radio-button>
      <vaadin-radio-button name="bar" id="radioBotonPublica" checked>
        Pública 
      </vaadin-radio-button>
     </vaadin-radio-group>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 0; align-self: stretch;" id="layoutNotificaciones">
   <vaadin-horizontal-layout style="align-self: flex-start; justify-content: flex-start;" id="vaadinHorizontalLayout2">
    <h4 style="margin: var(--lumo-space-xs);" id="tituloNotificaciones">Notificaciones</h4>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; margin: var(--lumo-space-s);" id="layoutPreferencias">
    <label id="labelPreferencias">Preferencias:</label>
    <vaadin-vertical-layout id="layoutCheckbox">
     <vaadin-checkbox id="checkboxMeGustas">
      Me Gustas
     </vaadin-checkbox>
     <vaadin-checkbox id="checkboxComentarios">
       Comentarios 
     </vaadin-checkbox>
     <vaadin-checkbox id="checkboxNuevosSeguidores">
       Nuevos Seguidores 
     </vaadin-checkbox>
     <vaadin-checkbox id="checkboxMenciones">
       Menciones y etiquetas 
     </vaadin-checkbox>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="align-self: center;">
   <vaadin-button id="botonRestaurar">
     Restaurar Preferencias 
   </vaadin-button>
   <vaadin-button id="botonGuardar">
     Guardar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

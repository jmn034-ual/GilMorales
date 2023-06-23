import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-cabecera-usuario-no-registrado')
export class VistaCabeceraUsuarioNoRegistrado extends LitElement {
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
<vaadin-vertical-layout id="cabeceraNR" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="z-index: 999; position: fixed;  width: 100%;">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: center; margin: var(--lumo-space-l);z-index: 2;">
   <vaadin-button theme="icon" aria-label="Add new" id="logoWeb" style="flex-grow: 0;background-color: transparent;">
    <iron-icon id="iconoWeb" style="width: 1px; height: 1px;"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="cabecera" style="align-self: center; justify-content: space-around; flex-grow: 0; height: 40%; margin: var(--lumo-space-xs); width: 100%; z-index: 2;">
   <vaadin-horizontal-layout id="barraBusqueda" style="justify-content: flex-start; flex-grow: 0; flex-shrink: 0; width: 40%; height: 50%;">
    <vaadin-text-field placeholder="Search" id="textoBusqueda" style="flex-grow: 0; width: 80%;background-color: #ffffff; border-radius: 5px;">
     <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
    </vaadin-text-field>
    <vaadin-button id="botonBuscar" style="background-color: #ffffff;">
      Buscar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-button id="inicio" style="background-color: #ffffff;">
     Inicio 
   </vaadin-button>
   <vaadin-button id="vaadinButton" style="background-color: #ffffff;">
     Iniciar Sesión 
   </vaadin-button>
   <vaadin-button id="botonRegistrarse" style="background-color: #ffffff;">
     Registrarse 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

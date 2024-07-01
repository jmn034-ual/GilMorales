import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver-comentarios-comercial')
export class VistaVerComentariosComercial extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="lex-grow: 1; height: 100%; width: 100%; z-index: 999; justify-content: center; padding-right: var(--lumo-space-m);" theme="spacing">
 <vaadin-vertical-layout theme="spacing" id="layoutInfo" style="flex-shrink: 0; align-items: center; border-radius: 10px; border: 2px solid #F5F5F5; margin-top: var(--lumo-space-xl); padding: var(--lumo-space-s); width: 25%; margin-bottom: var(--lumo-space-xl); align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" style="border-radius: 10px; width: 90%; background-color: #F5F5F5; align-self: center; margin-left: var(--lumo-space-m); padding: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" id="layoutpropietario" style="align-self: flex-start;">
    <vaadin-vertical-layout theme="spacing" id="layoutFotoPerfil">
     <vaadin-avatar id="vaadinAvatar" style="width: 100px; height: 100px;"></vaadin-avatar>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout id="vaadinVerticalLayout1">
     <vaadin-button theme="tertiary" id="botonNombreUsuario" style="color: black; font-weight: bold;">
       NombreUsuario 
     </vaadin-button>
     <label id="labelGeolocalizacion">Geolocalización</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <label id="labelDescripcion" style="flex-grow: 0;">Descripción de la publicación...</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutEstadisticas" style="width: 90%; border-radius: 10px; border: 2px solid #F5F5F5; align-self: center; margin-left: var(--lumo-space-m); justify-content: center; padding: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; justify-content: flex-start;">
    <vaadin-horizontal-layout theme="spacing-s" id="layoutMeGustas" style="flex-shrink: 0; flex-grow: 0;">
     <label id="numMeGustas" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
     <vaadin-button theme="icon" aria-label="Add new" id="botonMeGusta" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
      <iron-icon icon="vaadin:heart" style="height: 30px; width: 30px; color: black; align-self: center;"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-s" style="margin-left: var(--lumo-space-xl);" id="layoutNumComentarios">
     <label id="numComentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
     <vaadin-button theme="icon" aria-label="Add new" id="Comentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
      <iron-icon icon="vaadin:comments" style="height: 30px; width: 30px; color: black; align-self: center;"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="layoutVisualizaciones">
    <label id="numVisualizaciones" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
    <label id="labelVisualizaciones" style="align-self: center; font-weight: bold;">Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <hr style="height: 98%; z-index: 999; padding: 1px;" id="hr">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1; flex-shrink: 0; justify-content: flex-start; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl); align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="flex-grow: 1; width: 100%; flex-shrink: 0; align-self: stretch; border-radius: 10px; border: 2px solid #F5F5F5;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

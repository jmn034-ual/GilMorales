import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista-publicaciones-administrador-item')
export class VistaListaPublicacionesAdministradorItem extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%; min-height: 100%; min-width: 100%;">
 <vaadin-horizontal-layout theme="spacing-xs" id="vaadinHorizontalLayout3" style="height: 100%; width: 100%; padding: 10px; min-width: 100%; border-radius: 18px; border: 2px solid #F5F5F5; ">
  <vaadin-vertical-layout id="layoutVideoPublicacion" style="flex-grow: 0; flex-shrink: 0; width: 1200px; background-color: black; color: gray; border-radius: 18px; border: 2px solid #F5F5F5; padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: flex-start;" id="vaadinHorizontalLayout">
    <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
    <vaadin-button theme="tertiary" id="botonNombreUsuario">
      NombreUsuario 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <label id="labelGeolocalizacion" style="margin-left: var(--lumo-space-l);">Geolocalización</label>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; margin-bottom: var(--lumo-space-s); align-self: flex-end; padding: var(--lumo-space-s); margin-right: var(--lumo-space-m); margin-top: var(--lumo-space-xs); font-size: 13px; align-items: center;" id="vaadinHorizontalLayout1">
    <label id="numVisualizaciones" style="align-self: flex-end; flex-shrink: 0;">0</label>
    <label id="label">Visualizaciones</label>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout id="layoutVideo" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 1000px; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutDatos" style="justify-content: center; flex-grow: 1; flex-shrink: 0; border-radius: 18px; border: 2px solid #F5F5F5; background-color: white; height: 30%; align-self: center; padding: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" id="layoutBotonesUsuarioR" style="align-self: center; justify-content: flex-end; align-items: flex-start; flex-shrink: 0;">
    <vaadin-button id="botonEliminar" style="align-self: flex-start;" theme="primary error">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <hr style="width: 95%;">
   <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotonesPublicacion" style="align-self: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
     <label id="labelNumMeGustas" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
     <vaadin-button theme="icon" aria-label="Add new" id="labelMeGustas" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
      <iron-icon icon="vaadin:heart" id="ironIcon" style="height: 30px; width: 30px; color: black; align-self: center;"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0;" id="vaadinHorizontalLayout4">
     <label id="labelNumComentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
     <vaadin-button id="botonVerComentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; flex-shrink: 0; height: 50px; flex-grow: 0; width: 50px; padding: var(--lumo-space-s);">
      <iron-icon icon="vaadin:comments" id="ironIcon1" style="height: 30px; width: 30px; color: black; align-self: center; flex-grow: 0;"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <hr id="lineaHorizontal" style="width: 100%; height: 2px;">
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
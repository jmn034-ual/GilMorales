import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-avatar id="foto"></vaadin-avatar>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 70%;">
   <vaadin-button theme="tertiary" id="nombre">
     nombre de usuario 
   </vaadin-button>
   <label id="geolocalizacion" style="align-self: flex-start;">Geolocalizacion</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center;">
   <vaadin-button id="eliminarPub">
     Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="align-self: center; width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="height: 100%; flex-grow: 0;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="height: 100%; width: 100%;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
    <label id="numVis">0</label>
    <label id="vis">Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout6" style="flex-grow: 1;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout6">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-wrap: wrap; flex-grow: 0; height: 50%;">
     <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="align-items: center; flex-grow: 1; flex-shrink: 0;">
      <label id="numG">0</label>
      <label id="likesL">Likes</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout4" style="align-items: center; flex-grow: 1; flex-shrink: 0;">
     <label id="numC">0</label>
     <vaadin-button id="comentarios">
       Ver comentarios 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="align-self: flex-start; justify-content: flex-start; flex-grow: 0;">
    <label id="descripcion">Descrpcion</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}